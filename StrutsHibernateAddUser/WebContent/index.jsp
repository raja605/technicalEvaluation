<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>AddContact-Struts2 Hibernate Example</title>
<style type="text/css">
body, input {
	font-family: Calibri, Arial;
}
</style>
</head>
<body>

	<h1>Add Contact</h1>
	<s:actionerror />
	<s:form action="addContactdetails" method="post">
		<s:textfield name="contact.name" label="Name" />
		<s:textarea name="contact.address" label="Address" />
		<s:radio list="{'Male','Female'}" name="contact.gender" label="Gender"></s:radio>
		<s:submit value="Add Contact" align="center" />
	</s:form>

</body>
</html>
