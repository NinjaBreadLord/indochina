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
                <th>Name</th>
                <th>Email</th>
                <th>Edit</th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="user : ${userList}">
                <td th:text="${user.name}"></td>
                <td th:text="${user.email}"></td>
                <td><a th:href="@{/users/{id}/edit(id=${user.id})}">Edit</a></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
