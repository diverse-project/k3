The sources of these tutorials are in the _src_ folder, you aren't supposed to manually edit the other folders except if you know what're doing ;-)

To build them, you need to install node js (download from http://nodejs.org/)
and install gitbookio
$ npm install gitbook -g

Then compile the files using the following commands:
$ gitbook build ./src/k3_getting_started/ --output=./k3_getting_started
$ gitbook build ./src/k3_aspect/ --output=./k3_aspect

In the future, we'll see for an automatic compilation (jenkins), but for now you need to push the resulting static pages when you're done.