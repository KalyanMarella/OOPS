%{
#include<stdio.h>
%}
%%
[0-9] {printf("%s is digit\n",yytext);}
[a-z] {printf("%s is char\n",yytext);}
%%
int yywrap()
{
	return 1;
}
int main()
{
	yylex();
}
