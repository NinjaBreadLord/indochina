 {% include home.html %}
 <h1 style = "text-align: center">Sign Up</h1>

<form id="createuser">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>

  
  <button type="submit">Create Account</button>
</form>


  

<script>
  async function inputper(event) {
    event.preventDefault();

    const data = new FormData(event.target);
    const email = data.get("email");

    // Make a GET request to retrieve a list of all existing emails
    const response = await fetch("https://everittcheng.tk/api/login/");
    const existingEmails = await response.json();

    if (existingEmails.includes(email)) {
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
  // function inputper(event) {
  //     event.preventDefault();

  //     const data = new FormData(event.target);
  //     const urldata = new URLSearchParams(data).toString();

  //     fetch("https://everittcheng.tk/api/login/post/?" + urldata, {
  //       method: "POST",
  //       mode: "no-cors",
  //       headers: {
  //         "Content-Type": "application/json"
  //       }
  //     })
  // }

  // const make = document.getElementById("createuser");
  // make.addEventListener("submit", inputper);


</script>