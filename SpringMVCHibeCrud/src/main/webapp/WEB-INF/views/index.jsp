<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"> 


<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>


<style>
	.divBackImg{
		background-image: url("./images/tenis-ideal-pisada-supinada");
	}
</style>



<div id="mainDiv" style="background-color:lightblue"> 

	<h1 align="center" style="color: green">Registration Form</h1>
	<div id="signUpDiv" style="width: 300px; margin: 0 auto; padding: 10px;">
	 	 <form:form action="saveEmployee" commandName="employee" method="post">
		 		<div>
		 		<label for="registrationFirstName"> First Name</label> 
		 		<input type="text" class="form-control" id="firstName" name="firstName"><br/>
		 		</div>
		 		
		 		<div>
		 		<label for="registrationLastName">Last Name</label>
		 		<input type="text" class="form-control" id="lastName" name="lastName"><br>
		 		</div>
		 		
		 		<div>
		 		<label for="registrationEmpId">Emp Id</label>
		 		<input type="text" class="form-control" id="empId" name="empId"><br>
		 		</div>
		 		
		 		<div>
		 		<label for="registrationAge">Age</label>
		 		<input type="text" class="form-control" id="age" name="age"><br>
		 		</div>
		 		
		 		<div>
		 		<label for="registrationSalary">Salary</label>
		 		<input type="text" class="form-control" id="salary" name="salary"><br>
		 		</div>
		 		
		 		<div>
		 		<label for="registrationEducation">Education</label>
		 		<input type="text" class="form-control" id="edu" name="salary"><br>
		 		</div>
		 		
		 		<div>
		 		<input type="submit" value="SAVE"/>
		 		</div>	
	 	</form:form> 	
	</div>
</div>


