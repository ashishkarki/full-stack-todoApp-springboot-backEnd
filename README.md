# A Todo application built with SpringBoot. 
> Hosted on Google Cloud using Kubernetes here: http://34.68.60.80:8080/authenticate. Please note though the google cloud site might not always be up.

The site is protected with JWT based tokens. Here is a list of steps to get you started:
1. Send a POST request to http://34.68.60.80:8080/authenticate with proper credentials like so:
```sh
{
	    "username": "valid-user",
	    "password": "valid-password"
} 
```
This end point responds with a token which has be passed into every subsequent requests as a Bearer token.
  2. A sample request to GET all todos for a user dummy-user looks like so
```sh
	http://34.68.60.80:8080/jpa/users/ashish/todos 
```