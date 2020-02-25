
<%-- 用户信息--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/style.css" />
<!--[if IE 6]>
<script src="js/iepng.js" type="text/javascript"></script>
<script type="text/javascript">
    EvPNG.fix('div, ul, img, li, input, a');
</script>
<![endif]-->

<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<script type="text/javascript" src="js/select.js"></script>

<title>尤洪</title>
</head>
<body>


<%--嵌入Head.jsp--%>
<jsp:include page="/Struct/Head.jsp"></jsp:include>
<jsp:include page="/Struct/Search.jsp"></jsp:include>
<!--End Header End-->
<div class="i_bg bg_color">
    <!--Begin 用户中心 Begin -->
    <div class="m_content">

        <jsp:include page="/Struct/Left.jsp"></jsp:include>

        <div class="m_right">
            <table border="0" style="width:870px; line-height:22px;" cellspacing="0" cellpadding="0">
                <tr valign="top">
                    <td width="115"><img src="images/user.jpg" width="150" height="170" /></td>
                    <td>
                        <div class="m_user">系统管理员</div><br />
                        <p>
                            性别:
                            <c:choose>
                                <c:when test="${User.sex==1}">男</c:when>
                                <c:when test="${User.sex==0}">女</c:when>
                            </c:choose>
                            <br /><br />
                            邮箱:${User.email}<br /><br />
                            电话:${User.mobile}<br /><br />
                        </p>
                    </td>
                </tr>
            </table>

        </div>
        <!--End 用户中心 End-->
        <!--Begin Footer Begin -->
        <jsp:include page="/Struct/Bottom.jsp"></jsp:include>
        <!--End Footer End -->
    </div>
</div>


    <!--[if IE 6]>
    <script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
    <![endif]-->

</body>
</html>
