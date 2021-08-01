SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${THISDIR}/COPYING;md5=d41d8cd98f00b204e9800998ecf8427e"

FILESEXTRAPATHS_prepend := "${THISDIR}:"

SRC_URI = "file://src/*"

S = "${WORKDIR}/src"

inherit setuptools3

DEPENDS += "python3"
DEPENDS += "jansson-util-lib"
RDEPENDS_${PN} += "python3"
RDEPENDS_${PN} += "jansson-util-lib"

BBCLASSEXTEND = "native nativesdk"
