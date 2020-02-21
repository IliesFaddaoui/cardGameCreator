package main;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.*;
import card.*;

public class main {


    /**
     * Hello World: document constructor.
     */

        /** Path to the resulting PDF file. */
        public static final String RESULT
                = "out/production/SecurityAwarenessProjectAICE/pdf/pdf.pdf";

        /**
         * Creates a PDF file: hello_narrow.pdf
         * @param    args    no arguments needed
         */
    public static void main(String[] args) throws DocumentException, IOException {
    	
    		HardwareCard hc1 = new HardwareCard("Nouveau Disque Dur", "Augmente votre espace de stockage. Celui-ci vous permet de stocker plus de logiciel que vous n’utilisez pas, afin de les échanger ou de les utiliser plus tard.", 150);
    		HardwareCard hc2 = new HardwareCard("Nouveau Disque Dur", "Augmente votre espace de stockage. Celui-ci vous permet de stocker plus de logiciel que vous n’utilisez pas, afin de les échanger ou de les utiliser plus tard.", 100);
    		HardwareCard hc3 = new HardwareCard("Nouveau Disque Dur", "Augmente votre espace de stockage. Celui-ci vous permet de stocker plus de logiciel que vous n’utilisez pas, afin de les échanger ou de les utiliser plus tard.", 50);
    		HardwareCard hc4 = new HardwareCard("Barrette de Mémoire Vive (RAM)", "Augmente votre mémoire vide de 8Go. Celle-ci permet de faire tourner plusieurs software simultanément. Plus vous en avez et plus votre pc répondra rapidement.", 4);
    		HardwareCard hc5 = new HardwareCard("Barrette de Mémoire Vive (RAM)", "Augmente votre mémoire vide de 8Go. Celle-ci permet de faire tourner plusieurs software simultanément. Plus vous en avez et plus votre pc répondra rapidement.", 8);
    		SoftwareCard sc1 = new SoftwareCard("Bitdefender Antivirus Plus", "Votre antivirus vous donne un bonus par rapport à sa performance. Un antivirus est évalué principalement à l’aide de 2 facteurs : le premier est l’identification de malwares très répandus et très fréquent, le deuxième est la protection contre les attaques « zero-day ».", 6, 7, 5);
    		SoftwareCard sc2 = new SoftwareCard("Kapersky Antivirus", "Votre antivirus vous donne un bonus par rapport à sa performance. Un antivirus est évalué principalement à l’aide de 2 facteurs : le premier est l’identification de malwares très répandus et très fréquent, le deuxième est la protection contre les attaques « zero-day ».", 5, 7, 3);
    		SoftwareCard sc3 = new SoftwareCard("Norton Security", "Votre antivirus vous donne un bonus par rapport à sa performance. Un antivirus est évalué principalement à l’aide de 2 facteurs : le premier est l’identification de malwares très répandus et très fréquent, le deuxième est la protection contre les attaques « zero-day ».", 4, 5, 2);
    		SoftwareCard sc4 = new SoftwareCard("McAfee Antivirus Plus", "Votre antivirus vous donne un bonus par rapport à sa performance. Un antivirus est évalué principalement à l’aide de 2 facteurs : le premier est l’identification de malwares très répandus et très fréquent, le deuxième est la protection contre les attaques « zero-day ».", 2, 4, 2);
    		SoftwareCard sc5 = new SoftwareCard("Proxy", "Votre nouveau proxy vous permet de filtré les connexions entrantes ainsi que d’améliorer la sécurité de votre ordinateur. OS spécialisés : Vous avez mis vous même en place ce proxy : vous gagnez un niveau.", 2, 4, 4);
    		SoftwareCard sc6 = new SoftwareCard("VPN", "Vous avez mis en place un Virtual Private Network, votre maitrise en réseau et système s’est amélioré : vous gagnez un niveau. Ce réseau dans lequel les données échangées sont chiffrées protège vos données sensibles.", 2, 4, 4);
    		SoftwareCard sc7 = new SoftwareCard("Armée de Botnet", "Vos connaissances en réseau, système et cryptographie ont payé : vous avez contracté une armé de Botnet. Réservé aux OS Atk.", 8, 40, 8);
    		SkillCard skc1 = new SkillCard("Mot de passe fort", "Vous êtes passé de «clemsdu94 » à « clEm$du9@4!! » comme mot de passe, il est désormais more stronger. GG", 3);
    		SkillCard skc2 = new SkillCard("Méfiance", "Vous ne téléchargez pas n’importe quel lien et vous êtes sûr de ce que vous faites : vous ne vous laisserez pas avoir par un Trojan.", 0);
    		SkillCard skc3 = new SkillCard("Vigilance","Vous faites attention à qui touche à votre pc. Vous ne pouvez subir une attaque qui nécessite un accès physique à votre ordinateur.", 0);
    		//SingleUseCard suc1 = new SingleUseCard("Keylogger", "Vous pouvez récupérer toutes les entrées clavier de votre adversaire : le mot de passe fort de votre adversaire n’a donc plus de secret pour vous, il lui est donc défaussé. Vous parvenez à voler des informations qui vous permet de voler un software utilisant maximum 500Mo sur la RAM de votre adversaire. OS Atk: Votre logiciel est plus puissant et vous pouvez voler un logiciel allant jusqu’à 1,5Go.");        "
    		//MalwareCard mc1 = new MalwareCard("Ddos", "Saturation d’un serveur par des requêtes en nombres envoyées de manière malveillante. Le serveur ne répond plus. Ainsi, vos logiciels sont inutilisables face à cette menace. Vous pouvez le battre uniquement grâce à votre niveau d’expertise.”, 3, “Tant que votre puissance ne dépasse pas celle du Ddos, l’attaque continue et vous bloque 2Go de mémoire vive.", 1);
    		//MalwareCard mc2 = new MalwareCard("Trojan", "Logiciel malveillant, d’apparence première inoffensif qui installe à votre insu dans votre système une fonctionnalité malveillante. Ne pouvant pas le détecter à temps, les antivirus n’ont aucun effet sur le cheval de Troie (sauf contre-indication sur la carte).”, 2, “Le cheval de troie n'est pas nuisible en lui-même car il n'exécute aucune action, si ce n'est celle de permettre l'installation du vrai parasite… vous perdez un niveau.", 1);
    		//MalwareCard mc3 = new MalwareCard("Usb Killer", "Logiciel malveillant, d’apparence première inoffensif qui installe à votre insu dans votre système une fonctionnalité malveillante. Ne pouvant pas le détecter à temps, les antivirus n’ont aucun effet sur le cheval de Troie (sauf contre-indication sur la carte).”, 2, “Grille tout votre stuff hardware. Vous perdez un niveau.", 1);
    		
    		
    		
    		
    		
    		// step 1
        // Using a custom page size
        Document document = new Document(PageSize.A4);
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        // step 3
        document.open();
        // step 4
        document.add(new Paragraph(
                "Hello World! Hello People! " +
                        "Hello Sky! Hello Sun! Hello Moon! Hello Stars!"));
        // step 5
        document.close();
    }
}
