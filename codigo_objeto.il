 .assembly extern mscorlib {}
.assembly _codigo_objeto{}
.module _codigo_objeto.exe
.class public UNICA{
.method static public void _principal(){
.entrypoint
.locals (int64 i_contador)
ldc.i8 0
conv.r8
conv.i8
stloc i_contador
novo_rotulo1:
ldloc i_contador
conv.r8
conv.i8
call void [mscorlib]System.Console::Write(int64)
ldloc i_contador
conv.r8
ldc.i8 10
conv.r8
ceq
brfalse novo_rotulo3
ldstr "O contador chegou a 10"
call void [mscorlib]System.Console::Write(string)
br novo_rotulo2 
novo_rotulo3:
novo_rotulo2:
ldloc i_contador
conv.r8
ldc.i8 1
conv.r8
add
conv.i8
stloc i_contador
ldloc i_contador
conv.r8
ldc.i8 10
conv.r8
cgt
brfalse novo_rotulo1
ret
}
}
