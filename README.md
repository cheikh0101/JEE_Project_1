# TP JSP SERVLET

Création d'un projet maven web nommé sécuritéweb.

## Installation

Pour l'installation nous avons suivis les étapes ci-dessous:

1. Création d'un Dynamic Web Project
2. Configuration du name à securiteweb
3. Choix de la version 10.0 d'ApacheTomcat
4. Configuration du maeven project

![Capture](https://raw.githubusercontent.com/cheikh0101/JEE_Project_1/main/capture/Capture%20d%E2%80%99%C3%A9cran%202023-01-18%20%C3%A0%2019.56.06.png)
- Installation

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/architecture.png)
- Structuration du projet

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/configuration%20maeven.png)
- Configuration du maeven project avec la création du fichier pom.xml

## Création des entitées

Concernant les entitées, nous avons d'abord créé un package nommé _com.groupeisi.entities_ .

Après cela, s'en ai suivis la création de 2 classes: _Comptes.java_ et _Droits.java_ . Mais bien avant l'ORM Hibernate a été ajouté.

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/Ajout%20de%20Hibernate.png)
- Mis à jour du fichier pom.xml

Ci-dessous les captures des 2 classes:

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/Comptes%20entities.png)
- Comptes.java

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/Droits%20entities.png)
- Droits.java

## Création des dao

Ci-dessous les captures des dao qui ont été créé:

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/IComptes.png)
- IComptes.java

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/IDroits.png)
- IDroits.java

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/ComptesImpl.png)
- ComptesImpl.java

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/DroitsImpl.png)
- DroitsImpl.java

## Création des servlets

Ci-dessous les captures des différents servlets qui ont été mis en place dans le cadre de ce TP:

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/LoginServlet.png)
- LoginServlet.java

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/LogoutServlet.png)
- LogoutServlet.java

![Capture](https://raw.githubusercontent.com/cheikh0101/JEE_Project_1/main/capture/Capture%20d%E2%80%99%C3%A9cran%202023-01-18%20%C3%A0%2019.56.06.png)
- AccueilServlet.java

![Capture](https://raw.githubusercontent.com/cheikh0101/JEE_Project_1/main/capture/Capture%20d%E2%80%99%C3%A9cran%202023-01-18%20%C3%A0%2019.56.06.png)
- CompteServlet.java

![Capture](https://raw.githubusercontent.com/cheikh0101/JEE_Project_1/main/capture/Capture%20d%E2%80%99%C3%A9cran%202023-01-18%20%C3%A0%2019.56.06.png)
- DroitServlet.java

## Création d'une page de connexion

Ci-dessous la capture de la page de connexion

![Capture](https://raw.githubusercontent.com/cheikh0101/TP-JSP-Servlet/main/capture/login.png)
- index.jsp
## Création des views

Dans le cadre de ce TP de nombreux views ont été créé. Ci-dessous les captures 
