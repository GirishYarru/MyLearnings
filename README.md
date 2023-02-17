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


### 2. `POST /api/tree/`

sample payload
```
{
    "parent": "1",
    "label": "ant"
}
```

sample Response
```
{
    "insertionDate": "02/17/2023 5:40:07 am",
    "status": "SUCCESS",
    "node": {
        "parent": 3,
        "label": "cat"
    }
}
```

sample Response in case of exception
```
{

    "status": "FAILED"
    "cause": "parent not found for the given parent id : 1311",
    "date": "02/17/2023 5:43:32 am"
}
```


#### Please Note - Default 1 parent( id -1 and label - root)

**This application by default has the parent with id = 1 and label = root**
<br><br>

---

<br>

### 3. Data persistance

Hopefully relational database should be sufficient for this approach. There are many RDB's available in market. I would choose either MYSQL or Postgres as they are popular
for their features

Table schema
![image](https://user-images.githubusercontent.com/43373811/219521367-3514d311-bcf4-436d-bc1d-fe5757db0944.png)

1. nodes_data table


```
CREATE TABLE `demo`.`nodes_data` (
  `node_id` INT NOT NULL,
  `label` VARCHAR(100) NOT NULL
  PRIMARY KEY (`node_id`)
  
  );
```

2. nodes_relation_data table


```
  CREATE TABLE `demo`.`nodes_relation_data` (
  `node_id` INT NOT NULL,
  `parent_id` INT NOT NULL
   FOREIGN KEY(`node_id`d) REFERENCES `demo`.`nodes_data`(`node_id`)
  );
```
#### Task 3

Design a data schema for a database of your choice that would support the tree data above. Add to a `database.md` file.
<br><br>
#### Task 4

Write sample queries / code that would support the two routes that are detailed above. Add to a `database.md` file.
