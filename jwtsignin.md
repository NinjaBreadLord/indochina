<form action="javascript:login_user()">
    <p><label>
        User ID:
        <input type="text" name="uid" id="uid" required="" />
    </label></p>
    <p><label>
        Password:
        <input type="password" name="password" id="password" required="" />
    </label></p>
    <p>
        <button>Login</button>
    </p>
</form>

<script>
    function check(){
      if (document.cookie.indexOf("jwt") >= 0) {
        window.location.href = "/indochina/";
      }
    }
    check();
    // prepare URL's to allow easy switch from deployment and localhost
    url = "https://everittcheng.tk"
    // url = "http://localhost:8195"

    const login_url = url + '/authenticate';


    function login_user(){
        const email1 = document.getElementById("uid").value;
        const password1 = document.getElementById("password").value;
        //Validate Password (must be 6-20 characters in len)
        //verifyPassword("click");
        const body = {
            email: document.getElementById("uid").value,
            password: document.getElementById("password").value,
        };
        const requestOptions = {
            method: 'POST',
            mode: 'cors', // no-cors, *cors, same-origin
            cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
            credentials: 'include', // include, *same-origin, omit
            body: JSON.stringify(body),
            headers: {
                "content-type": "application/json",
            },
        };

        // URL for Create API
        // Fetch API call to the database to create a new user
        fetch(login_url, requestOptions)
            .then(response => {
                // trap error response from Web API
              if (response.status !== 200) {
                window.location.href = '/indochina/jwtsignin';
              }
              if (!response.ok) {
                const errorMsg = 'Login error: ' + response.status;
                console.log(errorMsg);
                return;
                window.alert("incorrect login");
              }
              return response.text();
              window.alert("successfully logged in");
              if (response.status == 200) {
                    localStorage.setItem("email", email1);
              }
            })

            
            // .then(data => {
            //   try {
            //     const jsonData = JSON.parse(data);
            //     localStorage.setItem("jwt", jsonData.jwt);
            //   } catch (e) {
            //     console.error("Error parsing JSON response: ", e);
            //   }
            // })
            // .catch(error => {
            //   console.error("Error fetching data: ", error);
            // });
        
    }
        // Redirect to Database location
        
</script>