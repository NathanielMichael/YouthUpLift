/**
 * Created with IntelliJ IDEA.
 * User: bryan_kroger
 * Date: 8/10/13
 * Time: 4:53 PM
 * To change this template use File | Settings | File Templates.
 */

function ProfileModel( firstName, lastName ){
    var self = this;
    self.name = name;
    self.firstName = firstName;
    self.lastName = lastName;
}

function ProfileViewModel() {
    var self = this;

    /*
    self.profiles = ko.observableArray([
        new ProfileModel( "Kira", "Kroger" ),
        new ProfileModel( "Bryan", "Kroger" ),
        new ProfileModel( "Nate", "Michael" )
    ]); */

    //console.log($.getJSON( "/api/profile").responseText);

    self.profiles = ko.observableArray();
}


//var json = $.getJSON( "/api/profile" );
//console.log( json["responseJSON"] );

var pvm = new ProfileViewModel();
$.getJSON( "/api/profile", function(data){
    pvm.profiles = data;
})
ko.applyBindings( pvm );



