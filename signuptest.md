<form id="createuser">
  <label for="email">Email:</label>
  <input type="email" id="email" name="email" required>
  <label for="password">Password:</label>
  <input type="password" id="password" name="password" required>

  <!-- Add additional input fields as needed -->
  
  <button type="submit">Create Account</button>
</form>

<script>
function inputper(event) {

    const data1 = new FormData(event.target);
    const email1 = data1.get("email");
    const password1 = data1.get("password");

    const userz = document.getElementById("personlist");


    const url = "https://everittcheng.tk/api/login/";

    const options = {
        method: 'GET', 
        mode: 'cors', 
        cache: 'default', 
        credentials: 'omit', 
        headers: {
        'Content-Type': 'application/json'
        },
    };

    // Make a GET request to retrieve a list of all existing emails
    const response = await fetch(url, options);
    fetch(url, options)
        .then(response => {
            if (response.status !== 200) {
                const errorMsg = 'Database response error: ' + response.status;
                console.log(errorMsg);
                const tr = document.createElement("tr");
                const td = document.createElement("td");
                td.innerHTML = errorMsg;
                tr.appendChild(td);
                userz.appendChild(tr);
                return;
            }
            response.json().then(data => {
                for (const row of data) {

                const tr = document.createElement("tr");

                const id = document.createElement("td");
                const email = document.createElement("td");
                const password = document.createElement("td");


                id.innerHTML = row.id;
                email.innerHTML = row.email;
                password.innerHTML = row.password;


                if (row.email == email1) {
                    var repeat= "repeat";
                }              
                }
            })
        })

    window.alert(repeat);
    if (repeat == "repeat") {
        alert("Email already in use.");
    } else {
        // Code to send the data to the server and create a new account
        const urldata = new URLSearchParams(data).toString();
        fetch("https://everittcheng.tk/api/login/post/?" + urldata, {
        method: "POST",
        mode: "no-cors",
        headers: {
            "Content-Type": "application/json"
        }
        });
    }
    };

const make = document.getElementById("createuser");
make.addEventListener("submit", inputper);
</script>

