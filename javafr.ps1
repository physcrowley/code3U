# ce script vous permet de compiler et lancer des 
# programmes Java avec un encodage UTF-8 uniforme
#
# USAGE :   .\javafr.ps1 [NomDeLaClasse]
# 
# NE PAS L'UTILISER AVEC LES VERSION DES JAVA 18+
# car ce problème est résolu dans ces versions
#

$file = $args[0] + ".java"
# change le tableau de DOS à windows-1252
chcp 28591 
# informe javac que le code source est encodé en UTF-8
javac -encoding utf-8 $file 
# lance le programme
java $args[0]