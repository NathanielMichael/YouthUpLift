/**
 * Created with IntelliJ IDEA.
 * User: bryan_kroger
 * Date: 8/10/13
 * Time: 4:53 PM
 * To change this template use File | Settings | File Templates.
 */

var pvm = new ProfileViewModel();

function ProfileModel( params ){
    var self = this;
    self.name = params.name;
    self.needs = params.needs;
    self.badges = params.badges;
    self.firstName = params.firstName;
    self.lastName = params.lastName;
}

function ProfileViewModel() {
    var self = this;

    self.profiles = ko.observableArray();

    self.update_profiles = function(){
        $.getJSON( "/api/profile", function(data){
            $.each( data, function( i, el ){
                if(el.needs == undefined){
                    el.needs = [];
                }
                pvm.profiles.push(new ProfileModel( el ));
            });
        })
    }


}

pvm.update_profiles();

ko.applyBindings( pvm );



