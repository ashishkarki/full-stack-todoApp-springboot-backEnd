package com.akarki.todo.rest.todorestfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static long idCounter = 0;

	static {
		for (int i = 0; i < 5; i++) {
			todos.add(new Todo(++idCounter, "ashish_" + idCounter, "start learning " + idCounter, new Date(),
					idCounter % 2 == 0 ? true : false));
		}
	}

	public List<Todo> findAllTodos() {
		return todos;

	}

	public Todo saveTodo(Todo savedTodo) {
		if (savedTodo.getId() == -1 || savedTodo.getId() == 0) {
			// this is a new item and needs to the inserted
			savedTodo.setId(++idCounter);
		} else {
			deleteById(savedTodo.getId());
		}

		todos.add(savedTodo);

		return savedTodo;
	}

	public Todo deleteById(long id) {
		Todo todoToDelete = findById(id);

		if (todoToDelete == null) {
			return null;
		}

		if (todos.remove(todoToDelete)) {
			return todoToDelete;
		}

		return null;
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}

		return null;
	}

}
