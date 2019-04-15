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

        <!-- TODO customize transformation rules 
             syntax recommendation http://www.w3.org/TR/xslt 
        -->
        <xsl:template match="/">
                <html>
                        <head>
                                <title>MultiplicationTable.xsl</title>
                                <link type="text/css" rel="stylesheet" href="/css/test.css"/>
                        </head>
                        <body>
                                <TABLE>
                                        <xsl:for-each select="/numbers/numberGroup">
                                                
                                                <xsl:for-each select="row">
                                                        <TR>
                                                                <xsl:for-each select="data">
                                                                        <TD>
                                                                                <SPAN>
                                                                                        <xsl:value-of select="formula"/>
                                                                                </SPAN>
                                                                                <xsl:choose>
                                                                                        <xsl:when test="product/@isPrimeNumber = 1">
                                                                                                <SPAN class="isPrimeNumber">
                                                                                                        <xsl:value-of select="product"/>
                                                                                                </SPAN> 
                                                                                        </xsl:when>
                                                                                        <xsl:otherwise>
                                                                                                <SPAN>
                                                                                                        <xsl:value-of select="product"/>
                                                                                                </SPAN>    
                                                                                        </xsl:otherwise>
                                                                                </xsl:choose>
                                                                        </TD>
                                                                </xsl:for-each>
                                                        </TR>
                                                </xsl:for-each>
                                                
                                        </xsl:for-each>
                                </TABLE>
                        </body>
                </html>
        </xsl:template>

</xsl:stylesheet>
