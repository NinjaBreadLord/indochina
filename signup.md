 {% include home.html %}
 <h1 style = "text-align: center">Sign Up</h1>

<style>
  @import url('https://fonts.googleapis.com/css?family=PT+Sans');

  h2{
    padding-top: 1.5rem;
  }
  a{
    color: #333;
  }
  a:hover{
    color: #da5767;
    text-decoration: none;
  }
  .card{
    border: 0.80rem solid #f8f9fa;
    top: 10%;
    width: 500px;
    height: auto;
    margin-left: auto;
    margin-right: auto;
  }
  .form-control{
    background-color: #f8f9fa;
    padding: 20px;
    padding: 20px 45px;
    margin-bottom: 1.3rem;
    margin-left: auto;
    margin-right: auto;
  }

  .form-control:focus {

      color: #000000;
      background-color: #ffffff;
      border: 10px solid #da5767;
      outline: 0;
      box-shadow: none;

  }

  .btn{
    padding: 0.6rem 1.2rem;
    background: #da5767;
    border: 2px solid #da5767;
  }
  .btn-primary:hover {

      
      background-color: #df8c96;
      border-color: #df8c96;
    transition: .3s;

  }
</style>

<div class="container">
  <div class="row justify-content-center">
    <div class="col-md-5">
      <div class="card">
        <h2 class="card-title text-center">Register</h2>
        <div class="card-body py-md-4">
          <form id="createuser">
            <div class="form-group">
              <input type="text" class="form-control" id="name" name="name" placeholder="name" required>
            </div>
            <div class="form-group">
              <input type="text" class="form-control" id="email" name="email" placeholder="email" required>
            </div>
            <div class="form-group">
                  <input type="text" class="form-control" id="password" name="password" placeholder="password" required>
            </div>
            <div class="form-group">
              <input type="text" class="form-control" id="dob" name="dob" placeholder="Birth Date(MO-DA-YEAR)" required>
            </div>
            <div class="d-flex flex-row align-items-center justify-content-between">
              <a href="/indochina/jwtsignin">Login</a>
              <button class="btn btn-primary">Create Account</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>



  

<script>

  function inputper(event) {
      event.preventDefault();

      const data = new FormData(event.target);
      const urldata = new URLSearchParams(data).toString();

      //const url = "https://everittcheng.tk/api/person/post/?"
      const url = "http://localhost:8195/api/person/post/?"  
      //Lowkey ion think this should be local host
      fetch(url + urldata, {
        method: 'POST', 
        mode: 'cors', 
        cache: 'no-cache', 
        credentials: 'include', 
        headers: {
          "Content-Type": "application/json"
        }
      })
      window.alert("account created successfully");
  }

  const make = document.getElementById("createuser");
  make.addEventListener("submit", inputper);


</script>