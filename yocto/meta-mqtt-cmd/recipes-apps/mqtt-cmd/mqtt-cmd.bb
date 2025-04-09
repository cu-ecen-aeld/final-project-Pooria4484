SUMMARY = "MQTT Command Executor Client"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b60fda17392cabfca1921ceaf91b799d"

SRC_URI = "git://github.com/Pooria4484/mqtt-cmd-client.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

RDEPENDS:${PN} += "python3 python3-paho-mqtt"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/git/mqtt_cmd_client.py ${D}${bindir}/mqtt-client
}
