<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
   <xsl:template match="/">
    <html>
      <body>
        <h2>Mi Colección de CD</h2>
        <table border="1">
           <tr>
             <th>Titulo</th>
             <th>Artista</th>
           </tr>
           <xsl:for-each select="catalogo/cd">
           <tr>
             <td><xsl:value-of select="titulo"/></td>
             <td><xsl:value-of select="artista"/></td>
           </tr>
           </xsl:for-each>
       </table>
     </body>
   </html>
  </xsl:template>
</xsl:stylesheet>


