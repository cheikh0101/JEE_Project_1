<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"></jsp:include>
<body>

<div class="container">
	<div class="row">
		<div class="col mt-5">
			<main class="form-signin">
			  <form>
			    <h1 class="h3 mb-3 fw-normal">Se connecter</h1>
			
			    <div class="form-floating">
			      <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
			      <label for="floatingInput">Addresse Email</label>
			    </div>
			    <div class="form-floating">
			      <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
			      <label for="floatingPassword">Mot de passe</label>
			    </div>			    
			    <button class="w-100 btn btn-lg btn-primary" type="submit">Connexion</button>
			  </form>
			</main>
		</div>
	</div>
</div>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>