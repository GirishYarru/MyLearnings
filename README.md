# Hinge Health Services Code Challenge

## Get Started

Techstack - Java, SpringBoot and Docker
This Application is developed using java and springboot. This application has been dockerized so that you can build image and run it on any platform.
 

### Features of this application
1. Implemented n-ary tree for adding Node
2. Optimized in memory consumption
3. Implemented the swagger documentation
4. This application has been dockarized
5. Wrote the test cases for most of the business logic
6. Layered project structure and followed the SOLID principles
7. Implemented loggers

### Prerequisites
1. Jdk 8 
2. Docker desktop for windows (Optional). please follow the instructions mentioned on this page https://docs.docker.com/desktop/install/windows-install/
3. Git bash (Optional)

&nbsp;
## Setup and run

1. Clone the application to your local system using the command 'git clone https://github.com/Hinge-Health-Recruiting/interviews-services_girish4118.git'
2. In case if you don't have the git bash directly download the zip file
3. After cloning/downloading navigate to the java_project and then open command prompt from there
4. use the command 'gradlew build' the project.
5. Once the build is success, navigate to the java_project/build/libs folder
6. Open the command prompt from there and run the command 'java -jar demo-0.0.1-SNAPSHOT.jar'. That's it :-)
7. hit the url in the browser 'http://localhost:3001/api/tree'



&nbsp;
## API Specifications

For the first two tasks, persisting data in memory or simple files is adequate.

The service should run on, `http://localhost:3001/api/<end-point>` and the following end points should be available.
<br><br>

---
<br>

### 1. `GET /api/tree` ;

sample response

```
[{
	"1": {
		"label": "root",
		"children": [
			[{
				"3": {
					"label": "ant",
					"children": [
						[{
							"5": {
								"label": "cat",
								"children": []
							}
						}]
					]
				}
			}],
			[{
				"4": {
					"label": "bear",
					"children": []
				}
			}]
		]
	}
}]
```

#### Task 1

Add the route and return the data structure that represents the animals example above.

*Note: This will be the first endpoint we test.*
<br><br>

---
<br>

### 2. `POST /api/tree/` with the payload of the format

```
{
    "parent": "<id>",
    "label": "<label>"
}
```

Will cause a node to be added to the end of a list of children, a new unique id should be assigned by the service. The response should be simple.

#### Task 2

Implement the route, and ensure that a `GET /api/tree` request returns the updated tree.
<br><br>

---

<br>

### 3. Data persistance

This part __does not__ have to be implemented in code. Document the queries, methods, and decisions you would make if implementing. 
<br><br>

#### Task 3

Design a data schema for a database of your choice that would support the tree data above. Add to a `database.md` file.
<br><br>
#### Task 4

Write sample queries / code that would support the two routes that are detailed above. Add to a `database.md` file.
