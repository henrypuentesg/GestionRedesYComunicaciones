//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Quiz;

public class Ask {
    int random;
    int initRandom;
    String[] question = new String[25];
    static String frage;

    public Ask() {

        //Question1-10aboutTransportLayer
        this.question[1] = "En una conexión entre Host A, con el puerto fuente X, y Host B, con el puerto destino Y, se envía un mensaje. El mensaje de respuesta va del puerto" +
                "$X a puerto Y" +
                "$Y a puerto Y" +
                "$X a puerto x" +
                "$Y a puerto X" +
                "$4";
        this.question[2] = "Aplicaciones de telefonía y videoconferencia IP suelen usar UDP en lugar de TCP, porque" +
                "$es más seguro" +
                "$control de congestión agiliza la  transmisión" +
                "$no es menos rápido" +
                "$permite la transmisión de multimedia" +
                "$2";
        this.question[3] = "Trafico de multimedia suele ser enviado mediante TCP, porque\n" +
                "$el control de congestión agiliza la transmisión\n" +
                "$el tráfico UDP suele ser bloqueado por firewalls\n" +
                "$es más rápido\n" +
                "$consume menos ancho de banda\n" +
                "$2";
        this.question[4] = "Una forma de enviar tráfico  de datos UDP fiable es mediante" +
                "$Extensiva programación y depuración en la capa de aplicación" +
                "$Reconfiguración de la firewall" +
                "$El uso de Sha256 en lugar de MD5 como suma de comprobación" +
                "$La instalación de un antivirus" +
                "$1";
        this.question[5] = "Si dos hosts envían simultáneamente un segmento UDP a un mismo puerto de un tercer host, ¿recibe este último ambos mensajes? ¿Los puede diferenciar?" +
                "$No, se genera un error 404" +
                "$Sí; se diferencias mediante la suma de comprobación" +
                "$Sí; el sistema operativo provee la dirección IP respectiva" +
                "$No, el tercer host responde un mensaje de timeout" +
                "$3";
        this.question[6] = "Mientras TCP cuenta con mayor confiabilidad en la transmisión, UDP cuenta con" +
                "$mayor aceptación" +
                "$mayor velocidad" +
                "$mayor seguridad" +
                "$compatibilidad" +
                "$2";
        this.question[7] = "Una de las desventajas del control de congestión de TCP es" +
                "$el consumo de recursos" +
                "$el número de puertos de destino" +
                "$el manejo de datos" +
                "$la reducción en la velocidad" +
                "$4";
        this.question[8] = "En protocolos TCP, flow-control service tiene como propósito" +
                "$evitar un sobre flujo en el búfer" +
                "$controlar el flujo de datos" +
                "$controlar la dirección de los datos" +
                "$enviar datos a un destino en específico" +
                "$1";
        this.question[9] = "Para crear la suma de chequeo en UDP se lleva a cabo" +
                "$codificación a SHA256" +
                "$suma binaria y codificación a MD5" +
                "$suma binaria y complemento a uno" +
                "$suma binaria y conversión a HEX" +
                "$3";
        this.question[10] = "Los puertos 80 y 443 se asocian generalmente con" +
                "$SMTP" +
                "$HTTP/HTTPS" +
                "$FTP" +
                "$DNS" +
                "$2";
        //Question11-21aboutNetworkLayer
        this.question[11] = "En un router el término forwarding  se refiere a" +
                "$ mover el paquete del puerto de entrada al puerto de salida" +
                "$mover el paquete al siguiente router" +
                "$responder un mensaje de entrada" +
                "$dirigir el paquete a su destino" +
                "$1";
        this.question[12] = "El enrutamiento se refiere a " +
                "$dirigir el paquete a su destino" +
                "$dirigir el paquete al siguiente router" +
                "$calcular el tiempo de envío" +
                "$modificar la dirección IP del paquete" +
                "$1";
        this.question[13] = "En qué criterio se basa un router para enviar paquetes" +
                "$Dirección MAC" +
                "$Dirección MAC e IP" +
                "$Dirección IP" +
                "$Máscara de subred" +
                "$3";
        this.question[14] = "En qué criterio se basa un switch para enviar paquetes" +
                "$Dirección IP y máscara de subred" +
                "$Dirección IP y MAC" +
                "$Dirección MAC" +
                "$Número de puerto origen" +
                "$3";
        this.question[15] = "Una tabla de ruteo se utiliza para" +
                "$guardar particulares de redes asociadas" +
                "$llevar constancia de los paquetes enviados" +
                "$calcular la ruta de envío más conveniente" +
                "$marcar rutas no seguras" +
                "$1";
        this.question[16] = "Cuántas direcciones IP tiene un router" +
                "$Una" +
                "$Una para cada interfaz" +
                "$Ninguna, usa las de los hosts" +
                "$Puede llegar a tener infinitas" +
                "$2";
        this.question[17] = "Qué tecnología se puede usar para conectar hosts bajo una sola IP" +
                "$NAT" +
                "$DHCP" +
                "$ISP" +
                "$WIFI" +
                "$1";
        this.question[18] = "Los paquetes de la capa Network son llamados" +
                "$Frames" +
                "$Bytes " +
                "$Segments" +
                "$Datagrams" +
                "$4";
        this.question[19] = "IPv6 crea un túnel a través de IPv4 para transmitir datos, y se lleva a cabo mediante" +
                "$la encapsulación de IPv6 en IPv4" +
                "$redirección a un router IPv6" +
                "$la encapsulación de IPv4 en IPv6" +
                "$el respectivo enrutamiento" +
                "$1";
        this.question[20] = "Una subred es una fracción de una red más grande, cuyos límites se definen por las interfaces de" +
                "$Host y switch" +
                "$Host y Hub" +
                "$Host y Bridge" +
                "$Host y Router" +
                "$4";

        this.question[21] = "Para intercambiar datos en la capa de Red, los terminales por lo menos deben:" +
                "$Configurar enlace PPP." +
                "$Mostrar la informacion." +
                "$Publiar la IP" +
                "$Enviar informacion del contenido." +
                "$1";

        this.question[22] = "En la capa dataLink, se deben armar Bloques de informacion que se son denominados _________" +
                " los cuales se complementan con una direccion de capa de enlace que se llama Direccion MAC." +
                "$MAC." +
                "$Direccion IP." +
                "$Trama." +
                "$DHCP." +
                "$3";

        this.question[23] = "En la capa dataLink, se deben armar Bloques de informacion que se son denominados _________" +
                " los cuales se complementan con una direccion de capa de enlace que se llama Direccion MAC." +
                "$MAC." +
                "$Direccion IP." +
                "$Trama." +
                "$DHCP." +
                "$3";


        //
        frage = this.question[this.random(1, 40)];
    }

    public int random(int min, int max) {
        this.initRandom = 0;

        do {
            this.random = (int)((double)(max - min) * Math.random() + (double)min);
        } while(this.initRandom == this.random);

        this.initRandom = this.random;
        return this.random;
    }
}
