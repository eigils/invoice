package com.mycompany.invoice.core;

import com.mycompany.invoice.core.controller.InvoiceControllerInterface;
import com.mycompany.invoice.core.service.InvoiceServiceInterface;
import com.mycompany.invoice.core.service.prefix.InvoiceServicePrefix;
/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;*/
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

/**
 * Hello world!
 *
 */
//@SpringBootApplication
//@Configuration
//@ComponentScan
/*@ComponentScan(basePackages = {
        "com.mycompany.invoice.controller.web",
        "com.mycompany.invoice.repository.database",
        "com.mycompany.invoice.service.prefix"
})*/
//@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args )
    {


       /* Scanner sc= new Scanner(System.in);


        System.out.println( "Quel est le type de controlleur (keyboard, web, douchette) ?" );

        String controllerType = sc.nextLine();

        System.out.println( "Quel est le type de service (number, prefix) ?" );

        String serviceType = sc.nextLine();

        System.out.println( "Quel est le type de repository (memory, database) ?" );

        String repositoryType = sc.nextLine();

        InvoiceControllerInterface invoiceController = null;
        InvoiceServiceInterface invoiceService = null;
        InvoiceRepositoryInterface invoiceRepository = null;

        try {
            invoiceController = (InvoiceControllerInterface) Class.forName("com.mycompany.invoice.controller.InvoiceController" + controllerType.substring(0, 1).toUpperCase() + controllerType.substring(1)).getDeclaredConstructor().newInstance();
            invoiceRepository = (InvoiceRepositoryInterface) Class.forName("com.mycompany.invoice.repository.InvoiceRepository" + repositoryType.substring(0, 1).toUpperCase() + repositoryType.substring(1)).getDeclaredConstructor().newInstance();
            invoiceService    = (InvoiceServiceInterface) Class.forName("com.mycompany.invoice.service.InvoiceService" + serviceType.substring(0, 1).toUpperCase() + serviceType.substring(1)).getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*switch (controllerType) {
            case "keyboard":
                invoiceController = new InvoiceControllerKeyboard();
                break;
            case "web":
                invoiceController = new InvoiceControllerWeb();
                break;
            case "douchette":
                invoiceController = new InvoiceControllerDouchette();
                break;
        }

        switch (serviceType) {
            case "number":
                invoiceService = new InvoiceServiceNumber();
                break;
            case "prefix":
                invoiceService = new InvoiceServicePrefix();
                break;
        }

        switch (repositoryType) {
            case "memory":
                invoiceRepository = new InvoiceRepositoryMemory();
                break;
            case "database":
                invoiceRepository = new InvoiceRepositoryDatabase();
                break;
        }*/

        /*invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);*/


        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfigPropertySource.class);
        // ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        /*ApplicationContext context = SpringApplication.run(App.class);
        InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);
        invoiceController.createInvoice();*/

    }


   /* @Bean
    public InvoiceServiceInterface configureInvoiceService() {
        return new InvoiceServicePrefix();
    }*/
}
