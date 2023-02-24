<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Cookie Example</title>
  </head>
  <body>
    <button onclick="createCookie()">Create Cookie</button>
    <button onclick="getCookie()">Get Cookie</button>
    <button onclick="deleteCookie()">Delete Cookie</button>
    <script>
      // Function to create a cookie with the name "myCookie"
      function createCookie() {
        document.cookie = "myCookie=Hello, World!";
        console.log("Cookie created");
      }
      // Function to get the value of the cookie with the name "myCookie"
      function getCookie() {
        const cookies = document.cookie.split(";").map(cookie => cookie.trim());
        const myCookie = cookies.find(cookie => cookie.startsWith("myCookie="));
        if (myCookie) {
          const value = myCookie.substring("myCookie=".length);
          console.log(`Cookie value: ${value}`);
        } else {
          console.log("Cookie not found");
        }
      }
      // Function to delete the cookie with the name "myCookie"
      function deleteCookie() {
        document.cookie = "myCookie=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/indochina;";
        console.log("Cookie deleted");
      }
    </script>
  </body>
</html>
