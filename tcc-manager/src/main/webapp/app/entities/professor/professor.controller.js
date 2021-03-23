(function() {
    'use strict';

    angular
        .module('tccmanagerApp')
        .controller('ProfessorController', ProfessorController);

    ProfessorController.$inject = ['Professor'];

    function ProfessorController(Professor) {

        var vm = this;

        vm.professors = [];

        loadAll();

        function loadAll() {
            Professor.query(function(result) {
                vm.professors = result;
                vm.searchQuery = null;
            });
        }
    }
})();
