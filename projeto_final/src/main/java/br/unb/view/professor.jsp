<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html>
<head>
    <title>Cadastro de Professores</title>
  <!-- Outras meta tags, títulos, etc... -->
  <link href="https://fonts.googleapis.com/css?family=Roboto&display=swap" rel="stylesheet">
   <link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>
<body>

    <h1>Cadastro de Professores</h1>

    <html:form action="/professor" method="post">

        <html:hidden property="method" value="${professorForm.id == 0 ? 'salvar' : 'atualizar'}"/>
		<html:hidden property="id" value="${professorForm.id}"/> <!-- Incluímos o campo oculto para o ID -->
		
		<span style="color: red">
        <html:errors/>
		</span>
        <p>
            <label for="nome">Nome:</label>
            <html:text property="nome" size="20"/>
        </p>

        <p>
            <html:submit value="${professorForm.id == 0 ? 'Salvar' : 'Atualizar'}"/>
        </p>

    </html:form>

    <h2>Lista de Professores</h2>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nome</th>
        </tr>
        <logic:iterate name="professores" id="professor">
             <tr>
                <td><bean:write name="professor" property="id" /></td>
                <td><bean:write name="professor" property="nome" /></td>
                <td>
                    <a href="<%= request.getContextPath() %>/professor.do?method=editar&id=<bean:write name='professor' property='id' />">Editar</a>
                </td>
                <td>
                    <a href="<%= request.getContextPath() %>/professor.do?method=excluir&id=<bean:write name='professor' property='id' />"
                       onclick="return confirm('Tem certeza que deseja excluir esse professor?');">Excluir</a>
                </td>
            </tr>
        </logic:iterate>
    </table>

</body>
</html>