Utilizaré la lista OWASP Top 10 de 2021 como guía para garantizar que nuestro sistema sea seguro.

Inyección de SQL (A1): Aseguraremos nuestro sistema para enviar vulnerabilidades por medio de inyección SQL en la aplicación. Utilizaremos consultas preparadas y ORM para prevenir estos riesgos.

Problemas de Autenticación y Sesiones (A2): Fortaleceremos la autenticación en nuestra aplicación, especialmente en la interacción con la base de datos y las credenciales de los usuarios. Si es posible, implementaremos la autenticación de dos factores.

Exposición de Datos Sensibles (A3): Garantizaremos que los datos sensibles de los clientes, como contraseñas, direcciones y números de teléfono, estén cifrados tanto en reposo como en tránsito. Limitaremos el acceso a estos datos solo a quienes realmente lo necesitan.

XML External Entities (XXE) (A4): Aseguraremos que nuestra aplicación esté protegida contra ataques XXE, especialmente si procesamos datos XML en algún lugar de nuestro sistema.

A5: Vulnerabilidades de Seguridad en el Control de Acceso (Access Control Security Misconfiguration)

Para abordar esta categoría, como responsable de seguridad, estaré atento a lo siguiente:Validación de autorización en el servidor,control de acceso riguroso,pruebas de penetración y auditorías regulares

Fallos de Seguridad en la Configuración (A6): Verificaremos que nuestra infraestructura en Kubernetes y AWS esté configurada de manera segura para evitar la exposición de datos sensibles y minimizar las superficies de ataque.

Cross-Site Scripting (XSS) (A7): Aseguraremos que no haya vulnerabilidades de XSS en la aplicación web desarrollada con JavaScript y Next.js. Implementaremos medidas de seguridad, como Content Security Policy (CSP).

Deserialización Insegura (A8): Aseguraremos que las deserializaciones de datos en nuestra aplicación se realicen de manera segura, especialmente en el backend implementado en FastAPI.

Falta de Registros y Monitorización de Seguridad (A10): Implementaremos registros y monitorización en nuestro sistema para detectar posibles intrusiones y actividades anómalas, utilizando herramientas como AWS CloudWatch y Elasticsearch.

