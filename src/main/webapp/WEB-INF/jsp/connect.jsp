<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Connexion mur</title>
</head>

<body>
<h1>${connectMessage}</h1>
<h2>Envoyer un message à un ami: </h2>
<FORM method="POST" ACTION="/murAmi">
    <P>   Entrez le nom de votre ami : <INPUT Type=text Name=loginAmi></P>
    <P>  Entrez votre message : <INPUT Type=text Name=messageAmi><P>
    <P>   <INPUT Type=submit VALUE="OK"><P>
</FORM>
</body>
</html>

