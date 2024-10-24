<?php

require_once("conex.php");

?>
<center>
<table border="1">
<tr>
    <td>codigo_cliente</td>
    <td>nombre_cliente</td>
    <td>nombre_contacto</td>
    <td>apellido_contacto</td>
    <td>telefono</td>
    <td>fax</td>
    <td>linea_direccio1</td>
    <td>linea_direccio2</td>
    <td>ciudad</td>
    <td>region</td>
    <td>pais</td>
    <td>codigo_postal</td>
    <td>codigo_empleado_rep_venta</td>
    <td>limite_credito</td>
    
    
</tr>

<?php
$query = "select * from cliente";


if ($stmt = $con->prepare($query)) {
    $stmt->execute();
    $stmt->bind_result($field1, $field2, $field3, $field4, $field5, $field6, $field7, $field8, $field9, $field10, $field11, $field12, $field13, $field14);
    while ($stmt->fetch()) {
        //printf("%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s\n", $field1, $field2, $field3, $field4, $field5, $field6, $field7, $field8, $field9, $field10, $field11, $field12, $field13, $field14);
        echo("<tr><td>$field1</td>");
        echo("<td>$field2</td>");
        echo("<td>$field3</td>");
        echo("<td>$field4</td>");
        echo("<td>$field5</td>");
        echo("<td>$field6</td>");
        echo("<td>$field7</td>");
        echo("<td>$field8</td>");
        echo("<td>$field9</td>");
        echo("<td>$field10</td>");
        echo("<td>$field11</td>");
        echo("<td>$field12</td>");
        echo("<td>$field13</td>");
        echo("<td>$field14</td>");
        echo("</tr>");
        
    }
    $stmt->close();
}

?>
</table>
</center>
