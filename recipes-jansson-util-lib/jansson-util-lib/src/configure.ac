AC_INIT([janssonutillib],[1.0])
AM_INIT_AUTOMAKE([foreign])

LT_INIT()
LT_PREREQ([2.4.6])
AC_CONFIG_SRCDIR([writejsonfile.c])
AC_PROG_CC
AC_PROG_RANLIB
AC_CONFIG_FILES([Makefile])
AC_CHECK_HEADERS([stdlib.h jansson.h])
AC_SEARCH_LIBS([json_load_file], [jansson])
AC_OUTPUT
