<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : TestXSL.xsl
    Created on : 2019年4月11日, 上午 9:18
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
				<title>貓名冊</title>
			</head>
			<body>
				<H1>貓名冊</H1>
				<xsl:template match="root/cats">
				<!--<p>姓名:<xsl:value-of select="name"/> 花色:<xsl:value-of select="color"/> 年齡:<xsl:value-of select="age"/></p>-->
					<xsl:apply-templates/>
				</xsl:template>
			</body>
		</html>
	</xsl:template>
	
	<xsl:template match="cat">
		<p>姓名:<xsl:value-of select="name"/> 花色:<xsl:value-of select="color"/> 年齡:<xsl:value-of select="age"/></p>
	</xsl:template>

</xsl:stylesheet>
