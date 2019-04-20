<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : MultiplicationTable.xsl
    Created on : 2019年4月12日, 下午 4:16
    Author     : COSH
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
        <xsl:output method="html"/>

        <!-- 版本2:使用stream生成九九乘法表並使用Ajax填充九九乘法表
             syntax recommendation http://www.w3.org/TR/xslt
        -->
        <xsl:template match="/">
                <html>
                        <head>
                                <title>MultiplicationTable.xsl</title>
                                <link type="text/css" rel="stylesheet" href="/css/test.css"/>
                                <SCRIPT type="text/javascript" src="/js/jquery-3.4.0.min.js"></SCRIPT>
                        </head>
                        <body>
                                <TABLE id="table">

                                </TABLE>
                                <SCRIPT type="text/javascript" src="/js/MultiplicationTable.js"></SCRIPT>
                        </body>
                </html>
        </xsl:template>

</xsl:stylesheet>
