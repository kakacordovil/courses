<!DOCTYPE html>
<html lang="en">
<head>
<title>Courses</title>
<link href="/bootstrap/4.0.0-beta/css/bootstrap.min.css"
    rel="stylesheet">
<style>
.container {
    margin-top: 80px;
}
.bg-dark {
    background-color: #3b8dbd !important;
}
</style>
</head>
<body>
        <div class="container">

            <form class="form-inline" method="post" action="/courses">
                <input
                    type="text" class="form-control mb-2 mr-sm-2 mb-sm-0"
                    id="name" name="name" placeholder="Course name" />
                <input
                    type="text"  class="form-control mb-2 mr-sm-2 mb-sm-0" id="price"
                    placeholder="description" name="description" />
                <button type="submit" class="btn btn-primary">Add</button>
            </form>
            <br/>
            <table class="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th> name</th>
                        <th>description</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <#list coursesList as item>
                    <tr>
                        <th scope="row">${item.ID}</th>

                        <th >${item.name}</th>

                        <td>${item.description}</td>

                        <a href="/courses/editCourse/${item.ID}">
                        <button type="submit" class="btn btn-warning">Delete</button> </td>
                        </a>

                         <th scope="row">${item.ID}</th>

                         <th >${item.name}</th>

                         <td>${item.description}</td>

                        <a href="/courses/editCourse/${item.ID}">
                        <button type="submit" class="btn btn-warning">Edit</button> </td>
                        </a>


                    </tr>
                    </#list>
                </tbody>
            </table>
        </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>




