# KataCalculateurImpots
Kata pour permettre au Ministère des Finances de calculer les impôts des entreprises

# Enoncé du kata

Le ministère des finances vous demande de créer un programme devant permettre de calculer les impôts dus par les entreprises françaises.

Dans un premier temps, ce programme devra gérer 2 types d'entreprise :

Les auto-entreprises, qui ont les propriétés suivantes :

- N° SIRET
- Dénomination

Les SAS, qui ont les propriétés suivantes :

- N° SIRET
- Dénomination
- Adresse du siège social

Le programme sera étendu par la suite avec d'autres types d'entreprise (SASU, SARL ...)

Par ailleurs, le calcul des impôts devra respecter les règles de gestion suivantes :

- Pour les auto-entreprises : impôts = 25% du CA annuel de l'entreprise
- Pour les SAS : impôts = 33% du CA annuel de l'entreprise

> Note : le CA de l'entreprise sera fourni au service par la classe de test et il n'est pas nécessaire de l'inclure dans les propriétés des entreprises.

# En anglais

J'ai pris la liberté de traduire en anglais (même si j'aurais bien aimé avoir un expert pour me confirmer), voici les mots-clés techniques :

| ------------------------ |:-----------------------------------------:|
| turnover                 | chiffre d'affaires annuel de l'entreprise |
| name                     | dénomination                              |
| head office address      | adresse du siège social                   |
| auto-entrepreneur        | auto-entreprise                           |