<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
        <xsl:output method="html"/>
        <xsl:template match="/">
                <HTML>
                        <HEADER>
                                <LINK type="text/css" rel="stylesheet" href="css/test2.css"/>
                        </HEADER>
                        <BODY>
                                <DIV class="title">
                                        <IMG>
                                                <xsl:attribute name="src">
                                                        <xsl:value-of select="/root/picture"/>
                                                </xsl:attribute>
                                        </IMG>
                                </DIV>
                                <DIV class="title">
                                        <P>
                                                <xsl:value-of select="/root/introduction"/>
                                        </P>
                                </DIV>
                                <DIV class="clear"></DIV>
                                <DIV class="listDiv">
                                        <xsl:for-each select="/root/educations/education">
                                                <UL>
                                                        <LI>
                                                                <xsl:value-of select="educationLevel"/>
                                                        </LI>
                                                        <LI>
                                                                <xsl:value-of select="department"/>
                                                        </LI>
                                                        <LI>
                                                                <xsl:value-of select="school"/>
                                                        </LI>
                                                </UL>
                                        </xsl:for-each>
                                </DIV>
                        </BODY>
                </HTML>
        </xsl:template>

</xsl:stylesheet>