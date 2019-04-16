<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : PrimeNumbersPractice2.xsl
    Created on : 2019年4月12日, 下午 2:48
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
		<HTML>
			<HEAD>
				<META charset="UTF-8"/>
				<META name="viewport" content="width=device-width, initial-scale=1.0"/>
				<TITLE>Prime Numbers 练习</TITLE>
                                <SCRIPT type="text/javascript" src="js/jquery-3.4.0.min.js"></SCRIPT>
			</HEAD>
			<BODY>
				<FIELDSET>
					<LEGEND>列出两整数之间的所有素数</LEGEND>
					<FORM >
						<TABLE>
							<TBODY>
								<TR>
									<TH>
										<LABEL for="minimum">Minimum</LABEL>
									</TH>
									<TD>
										<INPUT id="minimum" name="minimum" required="" type="number"></INPUT>
									</TD>
									<TH>
										<LABEL for="maximum">Maximum</LABEL>
									</TH>
									<TD>
										<INPUT id="maximum" name="maximum" required="" type="number"></INPUT>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
						<DIV style="padding:5px">
							<INPUT type="submit" value="送出" id="submit"></INPUT>
							<INPUT type="reset" value="清空"></INPUT>
						</DIV>
						<TEXTAREA style="width:640px;height:480px" cols="1" readonly="" rows="1" id='textArea'></TEXTAREA>
					</FORM>
				</FIELDSET>
				<SCRIPT type="text/javascript" src="js/PrimeNumbers.js"></SCRIPT>
			</BODY>
		</HTML>
	</xsl:template>
</xsl:stylesheet>
