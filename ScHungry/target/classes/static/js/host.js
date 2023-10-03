var app = {
    initialize: function() {
        this.bindEvents();
    },
    bindEvents: function() {
        document.addEventListener('deviceready', this.onDeviceReady, false);
    },
    onDeviceReady: function() {
        app.receivedEvent('deviceready');

        console.log("Cordova device plugin : " + device.uuid); // plugin function
    },
    receivedEvent: function(id) {
    }
};

app.initialize();