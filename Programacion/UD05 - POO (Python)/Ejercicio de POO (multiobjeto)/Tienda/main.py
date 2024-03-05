from Pantalones import Pantalones
from Camisetas import Camisetas
from Chandal import Chandal
from Balones import Balones
from Tienda import Tienda
from Cliente import Cliente

#---------------------------------------------------------------------------------------------------------------------------------------------------------------

tienda = Tienda()
cliente1 = Cliente()
cliente2 = Cliente()
cliente3 = Cliente()
cliente4 = Cliente()
cliente5 = Cliente()
cliente6 = Cliente()

#---------------------------------------------------------------------------------------------------------------------------------------------------------------

balon1 = Balones("balon", "adidas", "tango",120.0, "Fútbol")
balon2 = Balones("balon2", "nike", "liga",125.0, "Fútbol")
balon3 = Balones("balon3", "voleyball", "liga Voley",100.0, "Voley ball")
balon4 = Balones("balon4", "bullpadel", "championship",10.0, "padel")

camiseta1 = Camisetas("camiseta1", "rebook", "T11",45.0, "Blanco", "M", "tecnica", "Algodon")
camiseta2 = Camisetas("camiseta2", "rebook", "T12",95.0, "Negro", "M", "tecnica", "Poliester")

chandal1 = Chandal("Chandal1","UnderArmour","334",42.99, "Gris", "S")
chandal2 = Chandal("Chandal12","Kappa","34",22.99, "Negro", "S")

pantalon1 = Pantalones("pantalon1","Levis", "501", 127.99,"vaquero", "28","Largo" )
pantalon2 = Pantalones("pantalon2","Lee", "ryder", 127.99,"vaquero", "29","Largo" )

#---------------------------------------------------------------------------------------------------------------------------------------------------------------

tienda.obejtos_a_la_venta(balon1)
tienda.obejtos_a_la_venta(balon2)
tienda.obejtos_a_la_venta(balon3)
tienda.obejtos_a_la_venta(balon4)

tienda.obejtos_a_la_venta(camiseta1)
tienda.obejtos_a_la_venta(camiseta2)

tienda.obejtos_a_la_venta(chandal1)
tienda.obejtos_a_la_venta(chandal2)

tienda.obejtos_a_la_venta(pantalon1)
tienda.obejtos_a_la_venta(pantalon2)

#---------------------------------------------------------------------------------------------------------------------------------------------------------------

tienda.mostrar_objetos_a_la_venta()

cliente1.compra_add(balon1)
cliente2.compra_add(balon2)
cliente3.compra_add(balon3)
cliente4.compra_add(balon4)
cliente5.compra_add(camiseta1)
cliente6.compra_add(camiseta2)

tienda.comprar(cliente1)
tienda.comprar(cliente2)
tienda.comprar(cliente3)
tienda.comprar(cliente4)
tienda.comprar(cliente5)
tienda.comprar(cliente6)

tienda.mostrar_objetos_a_la_venta()