<%--
  Created by IntelliJ IDEA.
  User: cai
  Date: 2018/3/10
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <%@include file="easyuiBasic.jsp"%>

  </head>
  <body>


  <div class="easyui-window" title="登录窗口" style="top: 20%;left: 20%;width: 500px;height: 300px" id="button"  >
    <form action="${pageContext.request.contextPath}/account/toaccount" method="post" style="padding: 3% 10% 5% 20%">
      <table>
        <tr>
          <td>用户名:</td>
          <td><input type="text" class="easyui-textbox" name="cardNo"></td>
        </tr>
        <tr>
          <td>密码:</td>
          <td><input class="easyui-passwordbox" name="password"></td>
        </tr>
        <tr>
          <td><input type="reset" value="重置"></td>
          <td><input type="submit" value="登录" class="easyui-linkbutton" style="width: 35px;height: 35px" ></td>
        </tr>
      </table>

    <h1>${msg}</h1>

    </form>
  </div>
  </body>
</html>
