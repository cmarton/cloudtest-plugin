package com.soasta.jenkins.MakeAppTouchTestable;

f=namespace(lib.FormTagLib)

if (descriptor.showUrlField()) {
    f.entry(title:"CloudTest Server",field:"url") {
        f.select()
    }
}
f.entry(title:"XCode Projec File",field:"projectFile") {
    f.textbox()
}
f.entry(title:"Target",field:"target") {
    f.textbox()
}
f.advanced {
    f.entry(title:"Additional Options",field:"additionalOptions") {
        f.expandableTextbox()
    }
}
