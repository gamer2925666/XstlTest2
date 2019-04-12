<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : TestPage.xsl
    Created on : 2019年4月11日, 下午 3:16
    Author     : COSH
    Description:
	Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="html"/>

	<!-- TODO customize transformation rules 
	     syntax recommendation http://www.w3.org/TR/xslt 
	-->
	<xsl:template match="/">
		<html>
			<head>
				<title>TestPage.xsl</title>
				<link type="text/css" rel="stylesheet" href="/css/test.css"/>
			</head>
			<body>
				<p>空的XML</p>
				<img src="/image/CAT.jpg"/>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>
