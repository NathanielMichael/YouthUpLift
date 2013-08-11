/**
 * Created with IntelliJ IDEA.
 * User: bryan_kroger
 * Date: 8/10/13
 * Time: 4:53 PM
 * To change this template use File | Settings | File Templates.
 */

function ProfileModel( firstName, lastName ){
    var self = this;
    self.firstName = firstName;
    self.lastName = lastName;
}

function ProfileViewModel() {
    var self = this;

    self.profiles = ko.observableArray([
        new ProfileModel( "Kira", "Kroger" ),
        new ProfileModel( "Bryan", "Kroger" ),
        new ProfileModel( "Nate", "Michael" )
    ]);
}

ko.applyBindings(new ProfileViewModel());

