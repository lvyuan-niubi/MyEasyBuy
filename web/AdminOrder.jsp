<%-- 我的订单--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
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

            <p></p>
            <div class="mem_tit">我的订单</div>
            <%--
    session域中 有订单 有订单中所有上平
    sessionScope.Order 和 通过jstlforeach遍历 打印即可
--%>
            <div class="mem_tit">订单明细列表</div>
            <div>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style="margin-right:123px;">用户名：${Order.loginName}</span>
                <span style="margin-right:50px;">订单号：${Order.serialNumber}</span>
                <span style="margin-right:80px;">地址：${Order.userAddress}</span>
                <span style="margin-right:100px;">￥：${Order.cost}</span>
            </div>
            <table border="0" class="order_tab" style="width:930px; text-align:center; margin-bottom:30px;" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="20%">商品名称</td>
                    <td width="20%">商品图片</td>
                    <td width="25%">数量</td>
                    <td width="25%">价格</td>
                </tr>
                <c:forEach items="${ProductList}" var="product">
                    <tr>
                        <td>
                                ${product.name}
                        </td>
                        <td>
                                ${product.fileName}
                        </td>
                        <td>
                                ${product.quantity}
                        </td>
                        <td>
                                ${product.price}
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <!--End 用户中心 End-->
    <!--Begin Footer Begin -->
        <jsp:include page="/Struct/Bottom.jsp"></jsp:include>
    <!--End Footer End -->
</div>

</body>


<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</body>
</html>
