SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${THISDIR}/COPYING;md5=d41d8cd98f00b204e9800998ecf8427e"

FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI = "file://src/*"

S = "${WORKDIR}/src"

inherit autotools

DEPENDS = "jansson"



RDEPENDS_${PN} = "jansson"
FILES_${PN} += "${includedir}/*.h"
FILES_${PN} += "${B}${libdir}/libjanssonutil.a"

# do_install_append () {
#     bbwarn "${D}"
#     bbwarn "${includedir}"
#     bbwarn "${libdir}"

#     # header
#     install -d 755 ${D}${includedir}/jansslonutil
# 	install -m 644 ${S}/include/writejsonfile.h ${D}${includedir}/jansslonutil/writejsonfile.h

#     # library
#     install -d 755 ${D}${libdir}
# 	install -m 644 ${B}/libjanssonutil.a ${B}${libdir}
# }
