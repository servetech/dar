<%@ taglib uri='/WEB-INF/tlds/struts-tiles.tld' prefix='template' %>
<%@ taglib uri='/WEB-INF/c.tld' prefix="c" %>
<%@ taglib uri="/WEB-INF/tlds/zeprs.tld" prefix="zeprs" %>
<%@ taglib uri="/WEB-INF/tlds/struts-bean.tld" prefix="bean" %>
<html>
<head>
<title><template:get name='title'/></title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<META HTTP-EQUIV="Refresh" CONTENT="600">
<script type="text/javascript" src="/${appName}/js/browser_detect.js"></script>
<script type="text/javascript">
        //<![CDATA[
        var output = '';
        if (browser.isGecko)
        {
        output += '<link rel="stylesheet" href="/${appName}/css/styles-moz.css" charset="ISO-8859-1" type="text/css">';
        }
        else
        {
        output += '<link rel="stylesheet" href="/${appName}/css/styles-ie.css" charset="ISO-8859-1" type="text/css">';
        }
        document.write(output);
        //]]>
     </script>
</head>
<body>

<div id="banner-home">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="center" valign="middle" height="46" width="100px;"><span class="serviceHeader"><a href="/${appName}/home.do" border="0">ZEPRS</a></span></td>
            <td align="right">&nbsp;</td>
        </tr>
    </table>
    </div>
       <div id="maincontent">
            <h2><template:get name='header'/></h2>
            <template:get name='content'/>
        </div>
</body>
</html>

