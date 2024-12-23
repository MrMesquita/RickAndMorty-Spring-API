<div align="center" text-align="center">
    <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=gradient&text=RickAndMorty%20API&reversal=false">
</div>



# 🚀Rick and Morty Spring API
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
![GitHub pull requests](https://img.shields.io/github/issues-pr/Exploit-Experts/RickAndMorty-Spring-API)
![GitHub contributors](https://img.shields.io/github/contributors/Exploit-Experts/RickAndMorty-Spring-API)

RickAndMorty-Spring-API is a backend developed with Java and Spring Boot that implements a RESTful API to list data of characters from the Rick and Morty series. The project allows viewing character information and is prepared to be consumed by a separate front-end. 

This service provides a robust base for integration with client interfaces that consume character data through endpoints.

</br>

## 📋 Table of Contents
- [🎯 Objective](#objective)
- [🧑🏻‍💻 Credits](#credits)
- [🛠️ Technologies Used](#technologies-used)
- [📂 Installation and Execution](#installation-and-execution)
- [📃 Endpoints](#endpoints)
- [🤝 Contributing](#contributing)
- [⚖️ License](#license)

</br>

## Objective

Create a RESTful API that allows consuming and viewing data of characters from the Rick and Morty series, providing endpoints to be used in the [Angular front-end](https://github.com/Exploit-Experts/RickAndMorthy-client).

</br>

## Credits

||           |
| ---------------- | ---------------- |
| <img src="https://avatars.githubusercontent.com/u/114788642?v=4" float="left" width="40px" height=40px> | <a href='https://github.com/brunoliratm'>Bruno Magno</a> |
| <img src="https://avatars.githubusercontent.com/u/127964717?v=4" float="left" width="40px" height=40px> | <a href='https://github.com/Paulo-Araujo-Jr'>Paulo de Araujo</a> |
| <img src="https://avatars.githubusercontent.com/u/126338859?v=4" float="left" width="40px" height=40px> | <a href='https://github.com/MrMesquita'>Marcelo Mesquita</a> |
| <img src="https://avatars.githubusercontent.com/u/126990110?v=4" float="left" width="40px" height=40px> | <a href='https://github.com/Jonathanwsr'>Jonathan Rocha</a> |
| <img src="https://avatars.githubusercontent.com/u/180599406?v=4" float="left" width="40px" height=40px> | <a href='https://github.com/Klismans-Nazario'>Klismans Nazário</a> |
| <img src="https://avatars.githubusercontent.com/u/126925371?v=4" float="left" width="40px" height=40px> | <a href='https://github.com/leandrouser'>Leandro Oliveira</a> |

</br>

## Technologies Used

- ![Java](https://img.shields.io/badge/Java-21-blue)
- ![MySQL](https://img.shields.io/badge/database-MySQL-blue)
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-green)
- ![Spring Boot](https://img.shields.io/badge/Maven-3.9.9-green)
- ![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-3.3.4-green)
- ![Lombok](https://img.shields.io/badge/Lombok-1.18.34-green)

</br>

## Installation and Execution

1. Clone the repository:
```bash
git clone https://github.com/Exploit-Experts/RickAndMorty-Spring-API.git
```

2. Navigate to the project directory:
```bash
cd RickAndMorty-Spring-API
```

3. Copile project
```java
mvn clean install
```

4. Execute the jar
```
java -jar target/rickMorty-0.0.1-SNAPSHOT.jar
```

</br>

## Endpoints

- **Characters**
    - `GET /characters` - Retrieves all characters from the first page.
    - `GET /characters?page=1` - Retrieves all characters from a specific page.
    - `GET /characters?sort=NAME_ASC` - Retrieves all characters sorted by name (`NAME_ASC` or `NAME_DESC`).
    - `GET /characters?sort=STATUS_ASC` - Retrieves all characters sorted by status (`STATUS_ASC` or `STATUS_DESC`).
    - `GET /characters?name=Rick` - Retrieves all characters with a specific name.
    - `GET /characters?status=ALIVE` - Retrieves all characters with a specific status (`ALIVE`, `DEAD`, or `UNKNOW`).
    - `GET /characters?species=Human` - Retrieves all characters with a specific species.
    - `GET /characters?type=Clone` - Retrieves all characters with a specific type.
    - `GET /characters?gender=Male` - Retrieves all characters with a specific gender (`FEMALE`, `MALE`, `GENDERLESS`, or `UNKNOW`).
    - `GET /characters/{id}` - Retrieves a specific character by ID.
    - `GET /characters/avatar/{id}.jpeg` - Retrieves the avatar of a specific character by ID.
- **Episodes**
    - `GET /episodes` - Retrieves all episodes from the first page.
    - `GET /episodes?page=2` - Retrieves all episodes from a specific page.
    - `GET /episode?name=Rick` - Retrieves all episode with a specific name.
    - `GET /episode?episode=S01E01` - Retrieves all episode with a specific episode code. (expected = `SXXEXX`).
    - `GET /episodes?sort=NAME_ASC` - Retrieves all episodes sorted by name (`NAME_ASC` or `NAME_DESC`).
    - `GET /episodes?sort=EPISODE_CODE` - Retrieves all episodes sorted by status (`EPISODE_CODE` or `EPISODE_CODE_DESC`).
    - `GET /episodes/{id}` - Retrieves a specific episode by ID.
- **Locations**
    - `GET /locations` - Retrieves all locations from the first page.
    - `GET /locations?page=2` - Retrieves all locations from a specific page.
    - `GET /locations?name=Rick` - Retrieves all locations with a specific name.
    - `GET /locations?type=planet` - Retrieves all locations with a specific type.
    - `GET /locations?dimension=c-137` - Retrieves all locations with a specific dimension.
    - `GET /episodes?sort=NAME_ASC` - Retrieves all episodes sorted by name (`NAME_ASC` or `NAME_DESC`).
    - `GET /episodes?sort=TYPE_ASC` - Retrieves all episodes sorted by status (`TYPE_ASC` or `TYPE_DESC`).
    - `GET /episodes?sort=DIMENSION_ASC` - Retrieves all episodes sorted by name (`DIMENSION_ASC` or `DIMENSION_DESC`).
    - `GET /episodes?sort=TYPE_ASC` - Retrieves all episodes sorted by status (`TYPE_ASC` or `TYPE_DESC`).
    - `GET /locations/{id}` - Retrieves a specific location by ID.
- **Users**
    - `POST /users` - Registers a user by ID.
    - `PUT /users/{id}` - Fully updates user data.
    - `PATCH /users/{id}` - Partially updates user data by ID.
    - `DELETE /users/{id}` - _(soft delete)_ Deletes the user by ID.
- **Favorites**
  - `POST /favorites` - Registers a favorite and relationate with an user.
  - `GET /favorites/{userId}` - Retrieves all favorites for a specific user.
    - Parameters:
      - `page` (optional, default: 0) - The page number to retrieve.
      - `size` (optional, default: 10) - The number of items per page.
      - `sort` (optional, default: "asc") - sort asc/desc based on id.
  - `DELETE /favorites/{userId}/{favoriteId}` - Removes a specific favorite for a user.
  - `DELETE /favorites/{userId}` - Removes all favorites for a user.


### Swagger Documentation

The API documentation is available via Swagger. You can access it by navigating to the following URL after running the application: `http://localhost:8080/swagger-ui/index.html`

This documentation provides a detailed description of all available endpoints, their parameters, and responses, making it easier to understand and interact with the API.

</br>

## Contributing

<p>We welcome contributions from the open-source community. If you have any ideas, bug fixes, or feature requests, feel free to submit a pull request.</p>

</br>

## Roadmap
- [x] Implement the remaining endpoints.
- [x] Implement the remaining users and favorites operations.
- [x] Implement the remaining features.

</br>

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.


### References
- [Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Lombok](https://projectlombok.org/)

<img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=gradient&reversal=false&section=footer">
