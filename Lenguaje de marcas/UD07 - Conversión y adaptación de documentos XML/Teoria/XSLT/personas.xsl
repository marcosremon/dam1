<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <html>
          <head>
             <title>Información sobre
                  <xsl:value-of select="count(/personas/persona)"/> científicos
             </title>
         </head>
        <body>
               <h3>Información sobre 
                      <xsl:value-of select="count(/personas/persona)"/>
               científicos </h3>
              <br/>
             <xsl:apply-templates select="/personas/persona"/>
        </body>
      </html>
 </xsl:template>
 <xsl:template match="persona">
          <h3><xsl:value-of select="nombre"/></h3>
         <p><xsl:value-of select="descripcion"/></p>
        <br/>
  </xsl:template>
</xsl:stylesheet>
