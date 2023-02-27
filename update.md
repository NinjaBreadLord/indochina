<!DOCTYPE html>
<html xmlns:th="https://ninjabreadlord.github.io/indochina/recipelist">
<head>
    <meta charset="UTF-8">
    <title>Users</title>
</head>
<body>
    <h1>Users</h1>
    <table>
        <thead>
            <tr>
                <th style = "width: 100px;">Name</th>
                <th style = "width: 100px;">Region</th>
                <th style = "width: 50px;">Prep Time</th>
                <th style = "width: 200px;">Ingredients</th>
                <th style = "width: 400px;">Description</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="user : ${userList}">
                <td th:text="${user.name}"></td>
                <td th:text="${user.region}"></td>
                <td th:text="${user.preptime}"></td>
                <td th:text="${user.ingredients}"></td>
                <td th:text="${user.description}"></td>
                <td><a th:href="@{/users/{id}/edit(id=${user.id})}">Edit</a></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
