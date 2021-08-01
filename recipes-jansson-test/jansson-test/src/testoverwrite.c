#include <string.h>
#include <writejsonfile.h>

int main(int argc, char *argv[])
{
    if (argc > 1){
        writejsonfile(argv[1]);
    }
    else {
        writejsonfile(NULL);
    }
}
