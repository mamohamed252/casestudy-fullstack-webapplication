# Superhero Finding 101

The superhero finding application allows users to create superhero and super-villains organizations comprised of many heroes or villains, and allows users to report finding.

The application is built using Java, Spring Boot, and MariaDB.


## Running the app

### Install JDK (if not installed)
1. Download the [JDK](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) and run the installer

#### Install MariaDB (if not installed)
1. download MariaDB `https://mariadb.org/download/`
3. `head to src/main/resources` ` application.properties files. User and password can be changed there if needed.)`
4. `spring.datasource.username=""` 
`spring.datasource.password=""`
`set server port="8080"`


### Set up databases
1. `MariaDB -u root -p < superherofindingmohamedmohamed.sql`
2. `MariaDB  -u root -p < superherofindingmohamedmohamed.sql`

### Run tests
1. `clean compile test`

### Run application
1. `clean compile spring-boot:run`
2. Use app by opening [http://localhost:8080](http://localhost:8080) in a browser
3. Start by adding a location, then a hero, then an org, and then a finding!

Google API does not work fully with Dynamic map. A fully paid API version key is needed to run it.

Presentation link  [Mohamed Presentation](https://prezi.com/view/ZjiinISNrtLelM5cLWvf/)



