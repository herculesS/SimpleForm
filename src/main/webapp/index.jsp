<!DOCTYPE html>
<html>
<head>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>HelloWorld</title>
</head>
<body>
	<script type="text/javascript">
		$(function() {
			$("#nameBtn").click(function() {
				$("#helloMsg").text("Hello " + $("#name").val() + " !");
				$("#helloMsg").show();

			});
		});
	</script>
	<h1>Hello World!</h1>
	<p>What's your name?</p>
	<form action="form" method="post">
		<input type="text" name="name" id="name"></input>
		<button id="nameBtn" onclick="submit">Say "Hello"</button>
	</form>


	<p id="helloMsg" style="display: none;">Hello</p>

</body>
</html>